package in.pulseinfotech.printphoto.dto;

import java.util.ArrayList;

/**
 * This is class holds the details of an Album.
 * 
 * @author Raman Ahuja
 * @version 1.0
 * @since 16 September 2014 <br>
 * <br>
 * <br>
 * 
 * 
 */
public class Album extends Product {
	private ArrayList<Photo> albumPhotos = new ArrayList<>();

	public ArrayList<Photo> getAlbumPhotos() {
		return albumPhotos;
	}

	public void setAlbumPhotos(ArrayList<Photo> albumPhotos) {
		this.albumPhotos = albumPhotos;
	}
}
