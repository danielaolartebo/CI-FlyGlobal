package com.xplorcolombia.xplorcolombia.controllers;

import com.xplorcolombia.xplorcolombia.dto.DestinationDTO;
import com.xplorcolombia.xplorcolombia.service.DestinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/destination")
public class DestinationController {

    @Autowired
    private DestinationService destination;
    private List<DestinationDTO> lstDestination;

    @PostMapping(value = "/getDestination")
    public ResponseEntity<?> seeDestination(@RequestBody String id){

        lstDestination = destination.seeDestinationId(id);
        return ResponseEntity.ok().body(lstDestination);
    }

    @PostMapping(value = "/getDestinationperPackage")
    public ResponseEntity<?> seeDestinationPerPackage(@RequestBody String packages){

        lstDestination = destination.seeDestinationsPerPackage(packages);
        return ResponseEntity.ok().body(lstDestination);
    }

}
