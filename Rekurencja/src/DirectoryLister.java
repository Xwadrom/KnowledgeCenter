import java.io.File;


public class DirectoryLister {
    public static void main(String[] args) {
        File file = new File("D:/");
        showDirectories(file);
    }
    static void showDirectories(File file){
        File[]files = file.listFiles();
        if(files !=null)
            for (File f:files){
                if (f.isDirectory()){
                    System.out.println("folder "+ f.getAbsolutePath());
                    showDirectories(f);
                }else{
                    System.out.println("plik "+ f.getAbsolutePath());
                }
            }
    }
}
//Metoda showDirectories() przyjmuje jako argument obiekt klasy File, który powinien odzwierciedlać folder, który chcemy wylistować. Metoda listFiles() z klasy File zwraca listę plików i katalogów w aktualnej ścieżce lub wartość null, jeśli obiekt file odzwierciedla plik. W pętli for each wywołujemy rekurencyjnie metodę showDirectories() dla każdego podfolderu, wcześniej wyświetlając przeglądany folder, a pliki po prostu wyświetlamy na ekranie.