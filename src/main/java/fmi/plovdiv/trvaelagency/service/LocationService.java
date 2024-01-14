package fmi.plovdiv.trvaelagency.service;

import fmi.plovdiv.trvaelagency.location.Location;
import fmi.plovdiv.trvaelagency.location.dto.CreateLocationDTO;
import fmi.plovdiv.trvaelagency.location.dto.ResponseLocationDTO;
import fmi.plovdiv.trvaelagency.location.dto.UpdateLocationDTO;
import fmi.plovdiv.trvaelagency.repository.LocationRepository;
import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LocationService {

    @Autowired
    private LocationRepository locationRepository;

    @Autowired
    private ModelMapper modelMapper;

    public ResponseLocationDTO save(CreateLocationDTO createLocationDTO) {
        Location location = modelMapper.map(createLocationDTO, Location.class);
        location = locationRepository.save(location);

        ResponseLocationDTO responseLocationDTO = modelMapper.map(location, ResponseLocationDTO.class);

        return responseLocationDTO;
    }

    public ResponseLocationDTO edit(UpdateLocationDTO updateLocationDTO) {
        Location location = modelMapper.map(updateLocationDTO, Location.class);
        location = locationRepository.save(location);

        ResponseLocationDTO responseLocationDTO = modelMapper.map(location, ResponseLocationDTO.class);

        return responseLocationDTO;
    }

    public Boolean delete(long id) {
        try {
            locationRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<ResponseLocationDTO> findAll() {
        List<ResponseLocationDTO> locationDTOS = locationRepository.findAll()
                .stream()
                .map(location -> modelMapper.map(location, ResponseLocationDTO.class))
                .collect(Collectors.toList());

        return locationDTOS;
    }

    public ResponseLocationDTO findById(long id) {
        return modelMapper.map((locationRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException())), ResponseLocationDTO.class);
    }
}
