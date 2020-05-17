package koschei.config;

import koschei.models.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {
    @Bean(name = "island")
    public Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }
    @Bean(name = "wood")
    public Wood3 getWood(Rabbit4 rabbit){
        return new Wood3(rabbit);
    }
    @Bean(name = "rabbit")
    public Rabbit4 getRabbit(Duck5 duck){
        return new Rabbit4(duck);
    }
    @Bean(name = "duck")
    public Duck5 getDuck(Egg6 egg){
        return new Duck5(egg);
    }
    @Bean(name = "egg")
    public Egg6 getEgg(Needle7 needle){
        return new Egg6(needle);
    }
    @Bean(name = "needle")
    public Needle7 getNeedle(Deth8 deth){
        return new Needle7(deth);
    }
}
