import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;


public class GeradoraDeFigurinhas {


    public void cria(InputStream inputStream, String nomeArquivo) throws IOException {

        // leitura da imagem
       // InputStream inputStream = new URL("https://m.media-amazon.com/images/M/MV5BNDE3ODcxYzMtY2YzZC00NmNlLWJiNDMtZDViZWM2MzIxZDYwXkEyXkFqcGdeQXVyNjAwNDUxODI@._V1_UX128_CR0,3,128,176_AL_.jpg").openStream();

        BufferedImage imagemOriginal = ImageIO.read(inputStream);


        // crie nova imagem em memória com transparência e com novo tamanho
        int largura = imagemOriginal.getWidth();
        int altura = imagemOriginal.getHeight();
        int novaAltura = altura + 200;
        BufferedImage novaImagem = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT);


        // copia a imagem original para a nova imagem (em memória)
        Graphics2D graphics = (Graphics2D) novaImagem.getGraphics();
        graphics.drawImage(imagemOriginal, 0, 0, null);

        // configurar a fonte
        var fonte = new Font(Font.SANS_SERIF, Font.BOLD, 64);
        graphics.setColor(Color.YELLOW);
        graphics.setFont(fonte);


        // escreva uma frase na nova imagem
        graphics.drawString("Topzera", 100, novaAltura - 100);


        // escrever a nova imagem num arquivo
        ImageIO.write(novaImagem, "png", new File(nomeArquivo));



    }




}
