public class MovieLibrary {
    public static void main(String[] args) {
        Movie movie1 = new Movie();
        movie1.title = "Forrest Gump";
        movie1.description = "Historia życia Forresta, chłopca o niskim ilorazie inteligencji " +
                "z \n niedowładem kończyn, który staje się miliarderem i bohaterem wojny w Wietnamie.";
        movie1.director = "Robert Zemeckis";
        movie1.rating = 9;
        movie1.oscars = true;

        System.out.println("Informacje o filmie:");
        System.out.printf("Tytuł: %s\n", movie1.title);
        System.out.printf("Opis: %s\n", movie1.description);
        System.out.printf("Reżyser: %s\n", movie1.director);
        System.out.printf("Ocena: %s/10\n", movie1.rating);
        System.out.printf("Czy otrzymał Oskara: %s\n", movie1.oscars);

    }
}
