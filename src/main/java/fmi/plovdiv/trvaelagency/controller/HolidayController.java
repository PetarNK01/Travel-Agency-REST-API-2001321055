package fmi.plovdiv.trvaelagency.controller;

import fmi.plovdiv.trvaelagency.holiday.dto.CreateHolidayDTO;
import fmi.plovdiv.trvaelagency.holiday.dto.ResponseHolidayDTO;
import fmi.plovdiv.trvaelagency.holiday.dto.UpdateHolidayDTO;
import fmi.plovdiv.trvaelagency.service.HolidayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/holidays")
public class HolidayController {

    @Autowired
    private HolidayService holidayService;

    @PostMapping
    public ResponseEntity<ResponseHolidayDTO> create(@RequestBody CreateHolidayDTO createHolidayDTO) {
        ResponseHolidayDTO responseHolidayDTO = holidayService.save(createHolidayDTO);
        return ResponseEntity.ok(responseHolidayDTO);
    }

    @PutMapping
    public ResponseEntity<ResponseHolidayDTO> update(@RequestBody UpdateHolidayDTO updateHolidayDTO) {
        ResponseHolidayDTO responseHolidayDTO = holidayService.edit(updateHolidayDTO);
        return ResponseEntity.ok(responseHolidayDTO);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Boolean> delete(@PathVariable long id) {
        boolean isDeleted = holidayService.delete(id);
        return ResponseEntity.ok(isDeleted);
    }

    @GetMapping
    public ResponseEntity<List<ResponseHolidayDTO>> findAll() {
        List<ResponseHolidayDTO> responseHolidayDTOS = holidayService.findAll();
        return ResponseEntity.ok(responseHolidayDTOS);
    }

    @GetMapping("{id}")
    public ResponseEntity<ResponseHolidayDTO> findById(@PathVariable long id) {
        ResponseHolidayDTO responseHolidayDTO = holidayService.findById(id);
        return ResponseEntity.ok(responseHolidayDTO);
    }
}
