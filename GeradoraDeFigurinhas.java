import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GeradoraDeFigurinhas {


    public void create () throws IOException {

        // leitura da imagem
        BufferedImage imagemOriginal = ImageIO.read(new File("input/imagem.jpg"));


        // crie nova imagem em memória com transparência e com novo tamanho
        int largura = imagemOriginal.getWidth();
        int altura = imagemOriginal.getHeight();
        int novaAltura = altura + 200;
        BufferedImage novaImagem = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT);


        // copia a imagem original para a nova imagem (em memória)
        Graphics2D graphics = (Graphics2D) novaImagem.getGraphics();
        graphics.drawImage(imagemOriginal, 0, 0, null);


        // escreva uma frase na nova imagem


        // escrever a nova imagem num arquivo
        ImageIO.write(novaImagem, "png", new File("saida/figurinhas.png"));



    }

         public static void main(String[] args) throws IOException {
            var geradora = new GeradoraDeFigurinhas();
            geradora.create();
        }


}
