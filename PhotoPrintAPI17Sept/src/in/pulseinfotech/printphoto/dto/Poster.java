package in.pulseinfotech.printphoto.dto;

/**
 * This is class holds the details of a poster.
 * 
 * @author Raman Ahuja
 * @version 1.0
 * @since 16 September 2014 <br>
 * <br>
 * <br>
 * 
 * 
 */
public class Poster extends Product {
	private Photo photoPoster;

	public void Poster() {
		photoPoster = new Photo();
	}

	public Photo getPhotoPoster() {
		return photoPoster;
	}

	public void setPhotoPoster(Photo photoPoster) {
		this.photoPoster = photoPoster;
	}
}
