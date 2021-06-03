package pyramidsdao;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PyramidCSVDAO pdao = new PyramidCSVDAO();
        List<Pyramid> pyramids = pdao.readPyramidsCSVFile("C:\\\\Users\\\\20100\\\\Desktop\\\\ITI-AI-PRO\\\\Java\\\\pyramids.csv");

        for (int i = 0; i < pyramids.size(); i++) {
            System.out.println("# " + (i + 1) + pyramids.get(i));


            System.out.print(pyramids.get(i).getPharaoh() + "   ");
            System.out.print(pyramids.get(i).getAncientName() + "   ");
            System.out.print(pyramids.get(i).getBase1Length() + "   ");
            System.out.print(pyramids.get(i).getBase2Length() + "   ");
            System.out.print(pyramids.get(i).getHeight() + "   \n\n");

        }
    }
}
