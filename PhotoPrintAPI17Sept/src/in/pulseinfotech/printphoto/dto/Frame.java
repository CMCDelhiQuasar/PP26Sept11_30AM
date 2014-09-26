package in.pulseinfotech.printphoto.dto;

/**
 * This is class holds the details of a Frame.  
 * 
 * @author Raman Ahuja
 * @version 1.0
 * @since 16 September 2014 <br>
 * <br>
 * <br>
 * 
 * 
 */
public class Frame extends Product {
	private Photo framePhoto;

	public void Frame() {
		framePhoto = new Photo();
	}

	public Photo getFramePhoto() {
		return framePhoto;
	}

	public void setFramePhoto(Photo framePhoto) {
		this.framePhoto = framePhoto;
	}

}
