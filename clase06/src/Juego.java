public class Juego {

        int puntosDeJuego = 0;

        public int obtenerPuntuacion() {
            return puntosDeJuego;
        }

        class Contador {

            public void incrementarPuntuacion(int puntos) {
                puntosDeJuego += puntos;
            }

            public void decrementarPuntuacion(int puntos) {
                puntosDeJuego -= puntos;
            }

            public void resetearPuntuacion(){
                puntosDeJuego = 0;
            }
        }

}
