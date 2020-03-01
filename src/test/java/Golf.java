//Hola soy Jime :)
public class Golf
{
    private int[] hoyo = new int[18];
    private int hoyoActual = 0;

    public void hoyo(int tiros)
    {
        hoyo[hoyoActual++] = tiros;
    }

    public int puntuacion()
    {
        int puntuacion = 0;

        for (int i = 0; i < 18; i++)
        {
            puntuacion += hoyo[i];
        }

        return puntuacion;
    }
}