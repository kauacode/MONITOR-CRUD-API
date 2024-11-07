package com.example.monitor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/monitores")
public class MonitorController {

    @Autowired
    private MonitorDao monitorDao;

    @GetMapping
    public List<Monitor> listar() {
        return monitorDao.findAll();
    }

    @GetMapping("/{id}")
    public Monitor obter(@PathVariable int id) {
        return monitorDao.findById(id).orElse(null);
    }

    @PostMapping
    public Monitor incluir(@RequestBody Monitor monitor) {
        return monitorDao.save(monitor);
    }

    @PutMapping("/{id}")
    public Monitor atualizar(@PathVariable int id, @RequestBody Monitor monitorAtualizado) {
        Monitor monitorExistente = monitorDao.findById(id).orElse(null);
        if (monitorExistente != null) {
            monitorExistente.setNome(monitorAtualizado.getNome());
            monitorExistente.setCategoria(monitorAtualizado.getCategoria());
            monitorExistente.setTamanho(monitorAtualizado.getTamanho());
            monitorExistente.setValor(monitorAtualizado.getValor());
            return monitorDao.save(monitorExistente);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable int id) {
        monitorDao.deleteById(id);
    }
}
