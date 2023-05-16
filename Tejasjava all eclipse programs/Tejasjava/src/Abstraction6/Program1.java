package Abstraction6;
abstract class Instrument
{
public abstract void play();
}
class Piano extends Instrument
{
public void play()
{
System.out.println("Piano is playing tan tan tan tan");
}
}
class Flute extends Instrument
{
public void play()
{
System.out.println("Flute is playing toot toot toot toot");
}
}
class Guitar extends Instrument
{
public void play()
{
System.out.println("Guitar is playing tin tin tin");
}
}

public class Program1 {

public static void main(String[] args) {
Instrument i[]=new Instrument[10];
i[0]=new Piano();
i[1]=new Flute();
i[2]=new Guitar();
i[3]=new Piano();
i[4]=new Flute();
i[5]=new Guitar();
i[6]=new Piano();
i[7]=new Flute();
i[8]=new Guitar();
i[9]=new Piano();
for(int j=0;j<10;j++)
{
System.out.println("************************");
System.out.println("Object"+(j+1));
if(i[j]instanceof Piano)
{
i[j].play();
}
if(i[j]instanceof Flute)
{
i[j].play();
}
if(i[j]instanceof Guitar)
{
i[j].play();
}
}

}

}