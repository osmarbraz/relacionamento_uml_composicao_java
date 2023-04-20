
public class ClasseA {

    private ClasseB aClasseB; //Nome do link

    //A parte nasce junto com o todo
    //A parte não pode ser compartilhada com outro Todo
    public ClasseA() {
        aClasseB = new ClasseB();
    }
    //Pode recuperar a parte antes da morte do Todo

    public ClasseB getAClasseB() {
        return aClasseB;
    }
}
