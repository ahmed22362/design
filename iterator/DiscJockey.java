package iterator;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class DiscJockey {
    SongsOfThe90s songs90s;
    SongsOfThe80s songs80s;
    SongsOfThe70s songs70s;

    SongIterator iter70ssongs;
    SongIterator iter80ssongs;
    SongIterator iter90ssongs;

    public DiscJockey(SongIterator songs70s, SongIterator songs80s, SongIterator songs90s) {
		
		this.iter70ssongs = songs70s;
		this.iter80ssongs = songs80s;
		this.iter90ssongs = songs90s;
		
	}
	
    /* old method
	public void showTheSongs(){
		
		// Because the SongInfo Objects are stored in different
		// collections everything must be handled on an individual
		// basis. This is BAD!
		
		ArrayList aL70sSongs = songs70s.getBestSongs();
		
		System.out.println("Songs of the 70s\n");
		
		for(int i=0; i < aL70sSongs.size(); i++){
			
			SongInfo bestSongs = (SongInfo) aL70sSongs.get(i);
			
			System.out.println(bestSongs.getSongName());
			System.out.println(bestSongs.getBandName());
			System.out.println(bestSongs.getYearReleased() + "\n");
			
		}
		
		SongInfo[] array80sSongs = songs80s.getBestSongs();
		
		System.out.println("Songs of the 80s\n");
		
		for(int j=0; j < array80sSongs.length; j++){
			
			SongInfo bestSongs = array80sSongs[j];
			
			System.out.println(bestSongs.getSongName());
			System.out.println(bestSongs.getBandName());
			System.out.println(bestSongs.getYearReleased() + "\n");
			
		}
		
		Hashtable<Integer, SongInfo> ht90sSongs = songs90s.getBestSongs();
		
		System.out.println("Songs of the 90s\n");
		
		for (Enumeration<Integer> e = ht90sSongs.keys(); e.hasMoreElements();)
	    {
			SongInfo bestSongs = ht90sSongs.get(e.nextElement());
			
			System.out.println(bestSongs.getSongName());
			System.out.println(bestSongs.getBandName());
			System.out.println(bestSongs.getYearReleased() + "\n");
			
	    }
		
	}
*/
    //new method by itereator design pattern

    public void showTheSongsIter(){
        Iterator songs70s = iter70ssongs.createIterator();
        Iterator songs80s = iter80ssongs.createIterator();
        Iterator songs90s = iter90ssongs.createIterator();
        System.out.println("Songs of the 70s\n");
        printTheSongs(songs70s);
        System.out.println("Songs of the 80s\n");
        printTheSongs(songs80s);
        System.out.println("Songs of the 90s\n");
        printTheSongs(songs90s);
    }

    private void printTheSongs(Iterator iterator) {
        
        while(iterator.hasNext()){
            SongInfo songInfo = (SongInfo) iterator.next();
			System.out.println(songInfo.getSongName());
			System.out.println(songInfo.getBandName());
			System.out.println(songInfo.getYearReleased() + "\n");
        }
    }

}
