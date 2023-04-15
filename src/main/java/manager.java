public class manager {

private String [] films = new String [0];
private int limit;

public manager (){
    this.limit=5;

}
public manager (int limit){
this.limit=limit;
}
    //Добавление нового фильма.
    public void addFilm (String film){
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;

    }

    //Вывод всех фильмов в порядке добавления.
    public String[] findAll (){
        return films;

    }

    //Вывод максимально лимит* штук последних добавленных фильмов в обратном от добавления порядке

    public String [] findLast (){
        int massiveLength;
        if (films.length <limit){
            massiveLength = films.length;
        }
        else {
            massiveLength =limit;
        }
        String [] tmp = new String [massiveLength];
        for (int i = 0; i <tmp.length; i++) {
            tmp [i]= films[films.length-1-i];
        }
        return tmp;
    }




}
