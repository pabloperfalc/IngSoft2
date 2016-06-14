package volandoAlto.dominio;

import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Br1
 */
public class Idioma {
    String[] palabras;
    int idiomaActual;

    /**
     *
     */
    public Idioma() {
        this.idiomaActual = 0;
        this.palabras = new String[] {"Welcome.","Continue",
                    "Flight Information","Captain", "Flight", "Departure",
                    "Departure", "Estimated arrival time", "Destination", 
                    "Time information", "and weather on arrival",
                    "Welcome aboard.", "Flight attendant","Delayed","Select genre",
                    "classical","Pop","Rock","Electronics","Reggae","Alternative",
                    "Stopped","Playing"};
    }

    /**
     *
     * @return
     */
    public String[] getPalabras() {
        return palabras;
    }

    /**
     *
     * @param palabras
     */
    public void setPalabras(String[] palabras) {
        this.palabras = palabras;
    }

    /**
     *
     * @return
     */
    public int getIdiomaActual() {
        return idiomaActual;
    }

    /**
     *
     * @param idiomaActual
     */
    public void setIdiomaActual(int idiomaActual) throws FileNotFoundException {
        this.idiomaActual = idiomaActual;
        cargarPalabras();
    }
    
    /**
     *
     */
    public void cargarPalabras() throws FileNotFoundException {
        switch (this.idiomaActual) {
            case 0:
                String token1 = "";
                String file_name = "C:/idiomas/ingles.txt";
                Scanner inFile1 = new Scanner(new File(file_name)).useDelimiter(",\\s*");
                ArrayList<String> temps = new ArrayList<String>();
                while (inFile1.hasNext()) {
                  // find next line
                  token1 = inFile1.next();
                  temps.add(token1);
                }
                inFile1.close();    
                String[] tempsArray = temps.toArray(new String[0]);
                this.palabras = tempsArray;
                break;                
            case 1:
                token1 = "";
                file_name = "C:/idiomas/chino.txt";
                inFile1 = new Scanner(new File(file_name)).useDelimiter(",\\s*");
                temps = new ArrayList<String>();
                while (inFile1.hasNext()) {
                  // find next line
                  token1 = inFile1.next();
                  temps.add(token1);
                }
                inFile1.close();    
                tempsArray = temps.toArray(new String[0]);
                this.palabras = tempsArray;
                break;                
            case 2:
                token1 = "";
                file_name = "C:/idiomas/espaniol.txt";
                inFile1 = new Scanner(new File(file_name)).useDelimiter(",\\s*");
                temps = new ArrayList<String>();
                while (inFile1.hasNext()) {
                  // find next line
                  token1 = inFile1.next();
                  temps.add(token1);
                }
                inFile1.close();    
                tempsArray = temps.toArray(new String[0]);
                this.palabras = tempsArray;
                break;
            case 3:
                this.palabras = new String[] {"Добро пожаловать.","Продолжить",
                    "Информация о рейсах","Капитан", "Полет", "отъезд", "отъезд",
                    "время Ожидаемое прибытие", "назначения", "время информация",
                    "и погода по прибытии", "Добро пожаловать.", "Хозяйка",
                    "Рейс задерживается","Выберите жанр","классический","Поп",
                    "рок","электроника","Регги","альтернатива","арестованный",
                    "Я играл"};
                break;
            case 4:
                this.palabras = new String[] {"ترحيب","تواصل","معلومات الطيران",
                    "القبطان","الطيران","المغادرة","المغادرة", "والوقت" ,
                    " للوصول", "والمقصد", "المعلومات"," لدى وصوه", "مرحبا",
                    "تأخر الرحلة","تحديد النوع","كلاسيكي","فرقعة","صخرة ",
                    "إلكترونيات","الريغي ","البديل ","أوقف ","د لعبت"};
                break;
            case 5:
                this.palabras = new String[] {"Bem-vindo.","Continue",
                    "Informação de Voo","Capitão", "Flight", "Origem", 
                    "tempo da partida","tempo estimado de chegada", "destino",
                    "informações de tempo ","e clima na destino", 
                    "Bem-vindo a bordo.","Aeromoça","O vôo está atrasado",
                    "Selecione um gênero","Clássico","Estouro","Rocha",
                    "Eletrônica","Reggae","Alternativa","Detido","Joguei"};
                break;
            case 6:
                this.palabras = new String[] {"Benvenuto.","Continua",
                    "Informazioni Volo","capitano","volo","origine",
                    "Orario di partenza","Tempo stimato di arrivo","destinazione",
                    "informazioni in tempo","e il clima all'arrivo",
                    "Benvenuti a bordo.","Assistente di volo",
                    "Il volo è in ritardo","Selezionare un genere","Classico",
                    "Pop","Rock","Elettronica","Reggae","Alternativa","Arrestato",
                    "ho giocato"};
                break;
            case 7:
                this.palabras = new String[] {"歓迎.","続ける","フライト情報","船長",
                    "フライト","起源","出発時刻","到着予定時刻","先","時刻情報",
                    "到着時に、気候","ご搭乗ありがとうございます。","スチュワーデス",
                    "フライトが遅れている","ジャンルを選択","クラシカル","ポップ","ロック",
                    "エレクトロニクス","レゲエ","代替案","逮捕される","私は〜をした"};
                break;
            case 8:
                this.palabras = new String[] {"Willkommen.","Weitermachen",
                    "Fluginformationen","Kapitän","Flug","Herkunft",
                    "Abfahrtszeit","Geschätzte Ankunftszeit","Ziel",
                    "Zeitinformationen","Klima und bei der Ankunft",
                    "Willkommen an Bord.","Stewardess","Der Flug ist verspätet",
                    "Wählen Sie ein Genre","Klassik","Pop","Rock","Elektronik",
                    "Reggae","Alternative","Arrested","Ich spielte"};
                break;
            case 9:
                this.palabras = new String[] {"Accueil.","Continuez",
                    "Informations sur le vol","capitaine","vol","origine",
                    "Heure de départ","Heure d'arrivée estimée","destination",
                    "des informations de temps","et le climat à l'arrivée",
                    "Bienvenue à bord.","hôtesse de l'air","Le vol est retardé",
                "Je choisis un genre", "Classique", "Pop", "Rock", "Electronique",
                "Reggae", "Alternative", "Arrêté", "Lecture"};
                break;
            default:
                this.palabras = new String[] {"Welcome.","Continue",
                    "Flight Information","Captain", "Flight", "Departure",
                    "Departure", "Estimated arrival time", "Destination", 
                    "Time information", "and weather on arrival",
                    "Welcome aboard.", "Flight attendant","Delayed","Select genre",
                    "classical","Pop","Rock","Electronics","Reggae","Alternative",
                    "Stopped","Playing"};
                break;
        }
    }
}
