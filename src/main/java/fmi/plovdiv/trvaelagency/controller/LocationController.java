package fmi.plovdiv.trvaelagency.controller;

import fmi.plovdiv.trvaelagency.location.dto.CreateLocationDTO;
import fmi.plovdiv.trvaelagency.location.dto.ResponseLocationDTO;
import fmi.plovdiv.trvaelagency.location.dto.UpdateLocationDTO;
import fmi.plovdiv.trvaelagency.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/locations")
public class LocationController {

    @Autowired
    private LocationService locationService;

    @PostMapping
    public ResponseEntity<ResponseLocationDTO> create(@RequestBody CreateLocationDTO createLocationDTO) {
        ResponseLocationDTO responseLocationDTO = locationService.save(createLocationDTO);
        return ResponseEntity.ok(responseLocationDTO);
    }

    @PutMapping
    public ResponseEntity<ResponseLocationDTO> update(@RequestBody UpdateLocationDTO updateLocationDTO) {
        ResponseLocationDTO responseLocationDTO = locationService.edit(updateLocationDTO);
        return ResponseEntity.ok(responseLocationDTO);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Boolean> delete(@PathVariable long id) {
        boolean isDeleted = locationService.delete(id);
        return ResponseEntity.ok(isDeleted);
    }

    @GetMapping
    public ResponseEntity<List<ResponseLocationDTO>> findAll() {
        List<ResponseLocationDTO> responseLocationDTOS = locationService.findAll();
        return ResponseEntity.ok(responseLocationDTOS);
    }

    @GetMapping("{id}")
    public ResponseEntity<ResponseLocationDTO> findById(@PathVariable long id) {
        ResponseLocationDTO responseLocationDTO = locationService.findById(id);
        return ResponseEntity.ok(responseLocationDTO);
    }
}
