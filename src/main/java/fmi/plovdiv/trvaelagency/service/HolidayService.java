package fmi.plovdiv.trvaelagency.service;

import fmi.plovdiv.trvaelagency.holiday.Holiday;
import fmi.plovdiv.trvaelagency.holiday.dto.CreateHolidayDTO;
import fmi.plovdiv.trvaelagency.holiday.dto.ResponseHolidayDTO;
import fmi.plovdiv.trvaelagency.holiday.dto.UpdateHolidayDTO;
import fmi.plovdiv.trvaelagency.repository.HolidayRepository;
import fmi.plovdiv.trvaelagency.repository.LocationRepository;
import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HolidayService {

    @Autowired
    private HolidayRepository holidayRepository;

    @Autowired
    private LocationRepository locationRepository;

    @Autowired
    private ModelMapper modelMapper;

    public ResponseHolidayDTO save(CreateHolidayDTO createHolidayDTO) {
        Holiday holiday = modelMapper.map(createHolidayDTO, Holiday.class);
        holiday.setLocation(locationRepository.findById(createHolidayDTO.getLocation()).orElseThrow());
        holiday = holidayRepository.save(holiday);

        ResponseHolidayDTO responseHolidayDTO = modelMapper.map(holiday, ResponseHolidayDTO.class);

        return responseHolidayDTO;
    }

    public ResponseHolidayDTO edit(UpdateHolidayDTO updateHolidayDTO) {
        Holiday holiday = modelMapper.map(updateHolidayDTO, Holiday.class);
        holiday.setLocation(locationRepository.findById(updateHolidayDTO.getLocation()).orElseThrow());
        holiday = holidayRepository.save(holiday);
        ResponseHolidayDTO responseHolidayDTO = modelMapper.map(holiday, ResponseHolidayDTO.class);

        return responseHolidayDTO;
    }

    public Boolean delete(long id) {
       try {
            holidayRepository.deleteById(id);
            return true;
        } catch (Exception e) {
           return false;
       }
    }

    public List<ResponseHolidayDTO> findAll() {
        List<ResponseHolidayDTO> holidayDTOS = holidayRepository.findAll()
                .stream()
                .map(holiday -> modelMapper.map(holiday, ResponseHolidayDTO.class))
                .collect(Collectors.toList());

        return holidayDTOS;
    }

    public ResponseHolidayDTO findById(long id) {
        return modelMapper.map((holidayRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException())), ResponseHolidayDTO.class);
    }

}
