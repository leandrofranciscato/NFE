package br.com.linepack.main;

import br.com.linepack.classes.ConfiguraCertificados;
import br.com.linepack.classes.InutilizaNfe;
import java.io.IOException;
import javax.xml.bind.JAXBException;

public class Main {

    public static void main(String[] args) throws JAXBException, IOException {

        ConfiguraCertificados.configura();
        //ConsultaCadastro.processa();
        //ConsultaServico.processa();
        
        InutilizaNfe.processa();
    }

}
