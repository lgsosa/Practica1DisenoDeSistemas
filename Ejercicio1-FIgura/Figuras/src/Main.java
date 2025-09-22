public class Main {
    public static void main(String[] args) {

        //crear puntos
        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(0, 5);
        Punto p3 = new Punto(5, 5);
        Punto p4 = new Punto(5, 0);

        //crear lados para un cuadrado
        Lado lado1 = new Lado(p1, p2);
        Lado lado2 = new Lado(p2, p3);
        Lado lado3 = new Lado(p3, p4);
        Lado lado4 = new Lado(p4, p1);

        //crear y mostrar cuadrado
        Cuadrado cuadrado = Cuadrado.crearCuadrado(lado1, lado2, lado3, lado4);
        System.out.println(cuadrado);
        System.out.println("Lados del cuadrado: " + cuadrado.getLados());

        //crear cuadrado con lados de distinta longitud
        //Lado ladoMalo = new Lado(new Punto(0, 0), new Punto(0, 3));
        //Cuadrado cuadradoMalo = Cuadrado.crearCuadrado(lado1, ladoMalo, lado3, lado4);


        //crear puntos y lados nuevos para rectangulo
        Punto p5 = new Punto(8, 5);
        Punto p6 = new Punto(8, 0);
        Lado lado2Rect = new Lado(p2, p5);
        Lado lado3Rect = new Lado(p5, p6);
        Lado lado4Rect = new Lado(p6, p1);

        //crear y mostrar rectangulo
        Rectangulo rectangulo = Rectangulo.crearRectangulo(lado1, lado2Rect, lado3Rect, lado4Rect);
        System.out.println(rectangulo);
        System.out.println("Lados del rectángulo: "+rectangulo.getLados());

        //crear puntos y lados para el triangulo
        Punto p7 = new Punto(0, 0);
        Punto p8 = new Punto(3, 0);
        Punto p9 = new Punto(0, 4);
        Lado ladoT1 = new Lado(p7, p8);
        Lado ladoT2 = new Lado(p8, p9);
        Lado ladoT3 = new Lado(p9, p7);

        //crear y mostrar triangulo
        Triangulo triangulo = Triangulo.crearTriangulo(ladoT1, ladoT2, ladoT3);
        System.out.println(triangulo);
        System.out.println("Lados del triángulo: "+triangulo.getLados());

        //crear y mostrar circulo
        Punto centroCirculo = new Punto(5, 5);
        Circulo circulo = new Circulo(centroCirculo, 3);
        System.out.println(circulo);

    }
}