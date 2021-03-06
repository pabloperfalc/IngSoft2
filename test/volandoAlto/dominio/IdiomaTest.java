/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package volandoAlto.dominio;

import java.io.FileNotFoundException;
import volandoAlto.dominio.Idioma;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Nabo
 */
public class IdiomaTest {
    
    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
    }
    
    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     *
     */
    public IdiomaTest() {
    }
    
    /**
     *
     */
    @Before
    public void setUp() {
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of getPalabras method, of class Idioma.
     */
    @Test
    public void testConstructor() {
        Idioma idioma = new Idioma();
        assertEquals(idioma.getIdiomaActual(),0);
        String[] ingles = new String[] {"Welcome.","Continue",
                    "Flight Information","Captain", "Flight", "Departure",
                    "Departure", "Estimated arrival time", "Destination", 
                    "Time information", "and weather on arrival",
                    "Welcome aboard.", "Flight attendant","Delayed","Select genre",
                    "classical","Pop","Rock","Electronics","Reggae","Alternative",
                    "Stopped","Playing"};
        assertArrayEquals(idioma.getPalabras(),ingles);
    }
    
    /**
     *
     */
    @Test
    public void testIngles() throws FileNotFoundException {
        Idioma idioma = new Idioma();
        idioma.setIdiomaActual(0);
        assertEquals(idioma.getIdiomaActual(),0);
        String[] ingles = new String[] {"Welcome.","Continue",
                    "Flight Information","Captain", "Flight", "Departure",
                    "Departure", "Estimated arrival time", "Destination", 
                    "Time information", "and weather on arrival",
                    "Welcome aboard.", "Flight attendant","Delayed","Select genre",
                    "classical","Pop","Rock","Electronics","Reggae","Alternative",
                    "Stopped","Playing"};
        assertArrayEquals(idioma.getPalabras(),ingles);
    }
    
    /**
     *
     */
    @Test
    public void testChino() throws FileNotFoundException {
        Idioma idioma = new Idioma();
        idioma.setIdiomaActual(1);
        assertEquals(idioma.getIdiomaActual(),1);
        String[] ingles = new String[] {"欢迎","繼續","航班信息","队长","机票",
                    "出发","出发","预计抵达时间","目的地","时间信息","以及天气的到来",
                    "欢迎乘坐。","主持人","航班延误","选择风格","古典","流行的","岩石",
                    "电子","雷鬼","另类","被捕","我打"};
        assertArrayEquals(idioma.getPalabras(),ingles);
    }
    
    /**
     *
     */
    @Test
    public void testEspanol() throws FileNotFoundException {
        Idioma idioma = new Idioma();
        idioma.setIdiomaActual(2);
        assertEquals(idioma.getIdiomaActual(),2);
        String[] ingles = new String[] {"Bienvenido.","Continuar",
                    "Información del vuelo","Capitán","Vuelo","Origen",
                    "Hora de salida","Hora estimada de arribo","destino",
                    "informacion de hora", "y clima en destino","Bienvenido a bordo.",
                    "Azafata","El vuelo está demorado","Seleccione un género",
                    "Clásica","Pop","Rock","Electrónica","Reggae","Alternativa",
                    "Detenido","Reproduciendo"};
        assertArrayEquals(idioma.getPalabras(),ingles);
    }
    
    /**
     *
     */
    @Test
    public void testRuso() throws FileNotFoundException {
        Idioma idioma = new Idioma();
        idioma.setIdiomaActual(3);
        assertEquals(idioma.getIdiomaActual(),3);
        String[] ingles = new String[] {"Добро пожаловать.","Продолжить",
                    "Информация о рейсах","Капитан", "Полет", "отъезд", "отъезд",
                    "время Ожидаемое прибытие", "назначения", "время информация",
                    "и погода по прибытии", "Добро пожаловать.", "Хозяйка",
                    "Рейс задерживается","Выберите жанр","классический","Поп",
                    "рок","электроника","Регги","альтернатива","арестованный",
                    "Я играл"};
        assertArrayEquals(idioma.getPalabras(),ingles);
    }
    
    /**
     *
     */
    @Test
    public void testArabe() throws FileNotFoundException {
        Idioma idioma = new Idioma();
        idioma.setIdiomaActual(4);
        assertEquals(idioma.getIdiomaActual(),4);
        String[] ingles = new String[] {"ترحيب","تواصل","معلومات الطيران",
                    "القبطان","الطيران","المغادرة","المغادرة", "والوقت" ,
                    " للوصول", "والمقصد", "المعلومات"," لدى وصوه", "مرحبا",
                    "تأخر الرحلة","تحديد النوع","كلاسيكي","فرقعة","صخرة ",
                    "إلكترونيات","الريغي ","البديل ","أوقف ","د لعبت"};
        assertArrayEquals(idioma.getPalabras(),ingles);
    }
    
    /**
     *
     */
    @Test
    public void testPortugues() throws FileNotFoundException {
        Idioma idioma = new Idioma();
        idioma.setIdiomaActual(5);
        assertEquals(idioma.getIdiomaActual(),5);
        String[] ingles = new String[] {"Bem-vindo.","Continue",
                    "Informação de Voo","Capitão", "Flight", "Origem", 
                    "tempo da partida","tempo estimado de chegada", "destino",
                    "informações de tempo ","e clima na destino", 
                    "Bem-vindo a bordo.","Aeromoça","O vôo está atrasado",
                    "Selecione um gênero","Clássico","Estouro","Rocha",
                    "Eletrônica","Reggae","Alternativa","Detido","Joguei"};
        assertArrayEquals(idioma.getPalabras(),ingles);
    }
    
    /**
     *
     */
    @Test
    public void testItaliano() throws FileNotFoundException {
        Idioma idioma = new Idioma();
        idioma.setIdiomaActual(6);
        assertEquals(idioma.getIdiomaActual(),6);
        String[] ingles = new String[] {"Benvenuto.","Continua",
                    "Informazioni Volo","capitano","volo","origine",
                    "Orario di partenza","Tempo stimato di arrivo","destinazione",
                    "informazioni in tempo","e il clima all'arrivo",
                    "Benvenuti a bordo.","Assistente di volo",
                    "Il volo è in ritardo","Selezionare un genere","Classico",
                    "Pop","Rock","Elettronica","Reggae","Alternativa","Arrestato",
                    "ho giocato"};
        assertArrayEquals(idioma.getPalabras(),ingles);
    }
    
    /**
     *
     */
    @Test
    public void testJapones() throws FileNotFoundException {
        Idioma idioma = new Idioma();
        idioma.setIdiomaActual(7);
        assertEquals(idioma.getIdiomaActual(),7);
        String[] ingles = new String[] {"歓迎.","続ける","フライト情報","船長",
                    "フライト","起源","出発時刻","到着予定時刻","先","時刻情報",
                    "到着時に、気候","ご搭乗ありがとうございます。","スチュワーデス",
                    "フライトが遅れている","ジャンルを選択","クラシカル","ポップ","ロック",
                    "エレクトロニクス","レゲエ","代替案","逮捕される","私は〜をした"};
        assertArrayEquals(idioma.getPalabras(),ingles);
    }
    
    /**
     *
     */
    @Test
    public void testAleman() throws FileNotFoundException {
        Idioma idioma = new Idioma();
        idioma.setIdiomaActual(8);
        assertEquals(idioma.getIdiomaActual(),8);
        String[] ingles = new String[] {"Willkommen.","Weitermachen",
                    "Fluginformationen","Kapitän","Flug","Herkunft",
                    "Abfahrtszeit","Geschätzte Ankunftszeit","Ziel",
                    "Zeitinformationen","Klima und bei der Ankunft",
                    "Willkommen an Bord.","Stewardess","Der Flug ist verspätet",
                    "Wählen Sie ein Genre","Klassik","Pop","Rock","Elektronik",
                    "Reggae","Alternative","Arrested","Ich spielte"};
        assertArrayEquals(idioma.getPalabras(),ingles);
    }
    
    /**
     *
     */
    @Test
    public void testFrances() throws FileNotFoundException {
        Idioma idioma = new Idioma();
        idioma.setIdiomaActual(9);
        assertEquals(idioma.getIdiomaActual(),9);
        String[] ingles = new String[] {"Accueil.","Continuez",
                    "Informations sur le vol","capitaine","vol","origine",
                    "Heure de départ","Heure d'arrivée estimée","destination",
                    "des informations de temps","et le climat à l'arrivée",
                    "Bienvenue à bord.","hôtesse de l'air","Le vol est retardé",
                "Je choisis un genre", "Classique", "Pop", "Rock", "Electronique",
                "Reggae", "Alternative", "Arrêté", "Lecture"};
        assertArrayEquals(idioma.getPalabras(),ingles);
    }
}
