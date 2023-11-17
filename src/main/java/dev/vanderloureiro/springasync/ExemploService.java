package dev.vanderloureiro.springasync;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class ExemploService {

    private final Logger log = LogManager.getLogger();

    @Async
    public void processaRequisicao() {
        try {
            log.info("Iniciando processamento");
            Thread.sleep(1000L);
            log.info("Terminando processamento");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
