package in.pulseinfotech.printphoto.dto;

import in.pulseinfotech.printphoto.exception.AddressException;
import in.pulseinfotech.printphoto.exception.DimensionException;
import in.pulseinfotech.printphoto.exception.PaperTypeException;
import in.pulseinfotech.printphoto.services.communication.MailService;
import in.pulseinfotech.printphoto.services.logging.PrintPhotoLogger;
import in.pulseinfotech.printphoto.services.logging.PrintPhotoLogger.LOG;

/**
 * This is class holds the details of a photo. It is a subclass of
 * {@link Product}. It take details like Dimension, Paper Type, File Name.
 * 
 * @author Rima Das
 * @version 1.0
 * @since 16 September 2014 <br>
 * <br>
 * <br>
 * 
 * 
 *        {@link in.pulseinfotech.printphoto.dto.Photo#dimension Dimension},
 *        {@link in.pulseinfotech.printphoto.dto.Photo#paperType Paper Type},
 *        {@link in.pulseinfotech.printphoto.dto.Photo#fileName File Name}
 * 
 * @see Dimension
 * @see PaperType
 * 
 */

public class Photo extends Product {
	private static String FQCN = Photo.class.getName();
	/**
	 * This field holds the name of the image uploaded.
	 */
	private String fileName;

	/**
	 * This field holds the reference of the {@link Dimension} class which
	 * defines the length and width of the image.
	 */
	private Dimension dimension;

	/**
	 * This field holds the {@link PaperType}.
	 */
	private PaperType paperType;

	/**
	 * 
	 * @return filename The name of the file
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * 
	 * @param fileName
	 *            The name of the file
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * 
	 * @return reference to {@link Dimension}
	 */
	public Dimension getDimension() {
		return dimension;
	}

	/**
	 * 
	 * @param dimension
	 * @see Dimension
	 * @throws DimensionException
	 */
	public void setDimension(Dimension dimension) throws DimensionException {
		if (dimension != null) {
			this.dimension = dimension;
		} else {
			PrintPhotoLogger.log4j(FQCN, LOG.ERROR,
					"Null reference received for dimension",
					new DimensionException(
							"Null reference received for dimension"));
			throw new DimensionException(
					"Null reference received for dimension");
		}
	}

	/**
	 * 
	 * @return {@link PaperType}
	 */
	public PaperType getPaperType() {
		return paperType;
	}

	/**
	 * 
	 * @param paperType
	 * @throws PaperTypeException
	 */
	public void setPaperType(PaperType paperType) throws PaperTypeException {
		if (paperType != null) {
			if (paperType.equals(PaperType.GLOSSY)
					|| paperType.equals(PaperType.MATTE)
					|| paperType.equals(PaperType.METALLIC)
					|| paperType.equals(PaperType.LUSTURE)) {
				this.paperType = paperType;
			} else {
				PrintPhotoLogger
						.log4j(FQCN,
								LOG.ERROR,
								"Invalid papertype specified. Paper Type can only be th following: GLOSSY, MATTE, LUSTURE or METALLIC",
								new PaperTypeException(
										"Invalid papertype specified. Paper Type can only be th following: GLOSSY, MATTE, LUSTURE or METALLIC"));
				throw new PaperTypeException(
						"Invalid papertype specified. Paper Type can only be th following: GLOSSY, MATTE, LUSTURE or METALLIC");
			}
		} else {
			PrintPhotoLogger.log4j(FQCN, LOG.ERROR,
					"Null reference for papertyper recieved",
					new PaperTypeException(
							"Null reference for papertyper recieved"));
			throw new PaperTypeException(
					"Null reference for papertyper recieved");
		}
	}

}
