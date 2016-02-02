package ua.npu.project.library;

//Видання

public class Publication {
    //властивості: назва, рік, автор
    
    protected String name;
    protected int year;
    protected String author;
    
    public Publication(){
    this.name="";
    this.year=0;
    this.autor="";
    }
    
    public Publication (String name, int year, String author){
        
        this.name=name;
        this.year=year;
        this.author=author;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName (String name){
        this.name=name
    }
    
   public int getYear(){
        return year;
    }
    
    public void setYear (int year){
        this.year=year
    }
        
        public String getAuthor(){
        return author;
    }
    
    public void setAuthor (String author){
        this.author=author
}

@Override
public String toString(){
    return "Publication{"+"name='"+name+'\''+",year="+year+",author="+autor+'\''+ '}';
}
}
