package fmi.plovdiv.trvaelagency.controller;

import fmi.plovdiv.trvaelagency.reservation.dto.CreateReservationDTO;
import fmi.plovdiv.trvaelagency.reservation.dto.ResponseReservationDTO;
import fmi.plovdiv.trvaelagency.reservation.dto.UpdateReservatonDTO;
import fmi.plovdiv.trvaelagency.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @PostMapping
    public ResponseEntity<ResponseReservationDTO> create(@RequestBody CreateReservationDTO createReservationDTO) {
        ResponseReservationDTO responseReservationDTO = reservationService.save(createReservationDTO);
        return ResponseEntity.ok(responseReservationDTO);
    }

    @PutMapping
    public ResponseEntity<ResponseReservationDTO> update(@RequestBody UpdateReservatonDTO updateReservatonDTO) {
        ResponseReservationDTO responseReservationDTO = reservationService.edit(updateReservatonDTO);
        return ResponseEntity.ok(responseReservationDTO);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Boolean> delete(@PathVariable long id) {
        boolean isDeleted = reservationService.delete(id);
        return ResponseEntity.ok(isDeleted);
    }

    @GetMapping
    public ResponseEntity<List<ResponseReservationDTO>> findAll() {
        List<ResponseReservationDTO> responseReservationDTOS = reservationService.findAll();
        return ResponseEntity.ok(responseReservationDTOS);
    }

    @GetMapping("{id}")
    public ResponseEntity<ResponseReservationDTO> findById(@PathVariable long id) {
        ResponseReservationDTO responseReservationDTO = reservationService.findById(id);
        return ResponseEntity.ok(responseReservationDTO);
    }

}
