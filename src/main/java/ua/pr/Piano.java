package ua.pr;

import org.aspectj.lang.annotation.*;

@Aspect
public class Piano implements Instrument {

    @Pointcut("execution(* ua.pr.Instrumentalist.play(..))")
    public void playing() {};

    @AfterReturning("playing()")
    public void play(){
        System.out.println("Bochka bass kolbasit solo");
    }
}
