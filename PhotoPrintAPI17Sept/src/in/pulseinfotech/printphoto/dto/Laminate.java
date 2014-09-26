package in.pulseinfotech.printphoto.dto;


/**
 * This is class holds the details of a laminate.  
 * 
 * @author Raman Ahuja
 * @version 1.0
 * @since 16 September 2014 <br>
 * <br>
 * <br>
 * 
 * 
 */
public class Laminate extends Product{
	private Photo laminatePhoto;

	public void Laminate() {
		laminatePhoto = new Photo();
	}

	public Photo getLaminatePhoto() {
		return laminatePhoto;
	}

	public void setLaminatePhoto(Photo laminatePhoto) {
		this.laminatePhoto = laminatePhoto;
	}
}
