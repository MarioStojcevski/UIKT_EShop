package com.example.uikt_eshop.web;

import com.example.uikt_eshop.models.products.Monitor;
import com.example.uikt_eshop.service.MonitorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/monitors")
public class MonitorController {

    private final MonitorService monitorService;

    public MonitorController(MonitorService monitorService) {
        this.monitorService = monitorService;
    }

    @GetMapping
    List<Monitor> getMonitors() {
        return monitorService.getMonitors();
    }

    @GetMapping(value = "{id}")
    Monitor getMonitorById(@PathVariable Long id) {
        return monitorService.getMonitorById(id);
    }

    @PostMapping
    Monitor createMonitor(@RequestBody Monitor monitor) {
        return monitorService.createMonitor(monitor);
    }

    @PutMapping(value = "{id}")
    Monitor updateMonitor(@PathVariable Long id, @RequestBody Monitor monitor) {
        return monitorService.updateMonitor(id, monitor);
    }

    @DeleteMapping(value = "{id}")
    void deleteMonitor(@PathVariable Long id) {
        monitorService.deleteMonitor(id);
    }
}
