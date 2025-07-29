package br.ufrpe.consultorio.servico;
//SEM USO POR ENQUANTO
import java.util.ArrayList;
import java.util.List;
import br.ufrpe.consultorio.modelo.Medico;

public class ControladorMedico {
    private static ControladorMedico instance;
    private List<Medico> medicos;

    private ControladorMedico() {
        medicos = new ArrayList<>();
    }

    public static ControladorMedico getInstance() {
        if (instance == null) {
            instance = new ControladorMedico();
        }
        return instance;
    }

    public void adicionarMedico(Medico medico) {
        medicos.add(medico);
    }

    public List<Medico> getMedicos() {
        return medicos;
    }
}