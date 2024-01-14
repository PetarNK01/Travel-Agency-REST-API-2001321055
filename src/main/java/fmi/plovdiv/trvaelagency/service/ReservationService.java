package fmi.plovdiv.trvaelagency.service;

import fmi.plovdiv.trvaelagency.repository.HolidayRepository;
import fmi.plovdiv.trvaelagency.repository.ReservationRepository;
import fmi.plovdiv.trvaelagency.reservation.Reservation;
import fmi.plovdiv.trvaelagency.reservation.dto.CreateReservationDTO;
import fmi.plovdiv.trvaelagency.reservation.dto.ResponseReservationDTO;
import fmi.plovdiv.trvaelagency.reservation.dto.UpdateReservatonDTO;
import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReservationService  {

    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private HolidayRepository holidayRepository;

    @Autowired
    private ModelMapper modelMapper;


    public ResponseReservationDTO save(CreateReservationDTO createReservationDTO) {
        Reservation reservation = modelMapper.map(createReservationDTO, Reservation.class);
        reservation.setHoliday(holidayRepository.findById(createReservationDTO.getHoliday()).orElseThrow());
        reservation = reservationRepository.save(reservation);

        ResponseReservationDTO responseReservationDTO = modelMapper.map(reservation, ResponseReservationDTO.class);

        return responseReservationDTO;
    }

    public ResponseReservationDTO edit(UpdateReservatonDTO updateReservatonDTO) {
        Reservation reservation = modelMapper.map(updateReservatonDTO, Reservation.class);
        reservation.setHoliday(holidayRepository.findById(updateReservatonDTO.getHoliday()).orElseThrow());

        reservation = reservationRepository.save(reservation);

        ResponseReservationDTO responseReservationDTO = modelMapper.map(reservation, ResponseReservationDTO.class);

        return responseReservationDTO;
    }

    public Boolean delete(long id) {
        try {
            reservationRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<ResponseReservationDTO> findAll() {
        List<ResponseReservationDTO> responseReservationDTOS = reservationRepository.findAll()
                .stream()
                .map(reservation -> modelMapper.map(reservation, ResponseReservationDTO.class))
                .collect(Collectors.toList());

        return responseReservationDTOS;
    }

    public ResponseReservationDTO findById(long id) {
        return modelMapper.map((reservationRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException())), ResponseReservationDTO.class);
    }
}
