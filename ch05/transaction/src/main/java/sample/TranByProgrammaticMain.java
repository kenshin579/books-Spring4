package sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sample.biz.domain.Pet;
import sample.biz.service.PetService;

import java.util.Date;

public class TranByProgrammaticMain {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-tranByProgrammatic.xml");
        PetService petService = ctx.getBean(PetService.class);
        Pet pet = new Pet();
        pet.setPetId(1);
        pet.setPetName("나비");
        pet.setOwnerName("홍길동");
        pet.setPrice(10000);
        pet.setBirthDate(new Date());

        petService.updatePetProgrammaticTransaction2(pet);

    }
}
