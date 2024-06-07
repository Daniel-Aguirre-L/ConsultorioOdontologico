package DH.ClinicaOdontologica.service;

import DH.ClinicaOdontologica.entity.Turno;
import DH.ClinicaOdontologica.repository.TurnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TurnoService {
    @Autowired
    private TurnoRepository turnoRepository;

    public Turno guardarTurno(Turno turno){
        return turnoRepository.save(turno);
    }
    public Optional<Turno> buscarPorId(Long id){
        return turnoRepository.findById(id);
    }

    public void actualizarTurno(Turno turno){
        turnoRepository.save(turno);
    }
    public void eliminarTurno(Long id){
        turnoRepository.deleteById(id);
    }
    public List<Turno> listarTodos(){
        return turnoRepository.findAll();
    }
}


