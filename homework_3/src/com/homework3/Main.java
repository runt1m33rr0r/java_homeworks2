package com.homework3;

public class Main {

    public static void main(String[] args) {
	    Gallery gallery = new Gallery("some address", 10);
	    Art art1 = new Art("art1", 200, ArtType.Carving);
	    Art art2 = new Art("art2", 50, ArtType.Ceramic);
	    Art art3 = new Art("art3", 100, ArtType.Picture);
		Art art4 = new Art("art4", 100, ArtType.Picture);

	    gallery.addArt(art1);
	    gallery.addArt(art2);
	    gallery.addArt(art3);
	    gallery.addArt(art4);

        System.out.println(gallery.getArtCountByArea());
		System.out.println(gallery.getEveryThirdArt().size());
    }
}
