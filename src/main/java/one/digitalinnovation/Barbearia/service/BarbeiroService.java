package one.digitalinnovation.Barbearia.service;

import one.digitalinnovation.Barbearia.repository.BarbeiroRepository;
import one.digitalinnovation.Barbearia.model.Barbeiro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class BarbeiroService {

    @Autowired
    private BarbeiroRepository barbeiroRepository;

    public void salvarBarbeiro(Barbeiro barbeiro){
        barbeiroRepository.save(barbeiro);

    }

   public List<Barbeiro> todosBarbeiros(){
        return barbeiroRepository.findAll();
   }

   public Optional<Barbeiro> buscarBarbeiros(Long id){
        return barbeiroRepository.findById(id);

   }

   public Optional <Barbeiro> status(boolean trabalha){
        Optional<Barbeiro> barbeiroOptional=barbeiroRepository.status(trabalha);

        if(barbeiroOptional.isEmpty()){
            System.out.println("Não trablha  aqui");
        }

        return barbeiroOptional ;
   }

   public void deletarBarbeiro(Long id ){
        barbeiroRepository.deleteById(id);

   }



}
