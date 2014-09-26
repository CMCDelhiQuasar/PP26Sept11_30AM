package in.pulseinfotech.printphoto.dto;

import in.pulseinfotech.printphoto.exception.PaperTypeException;
import in.pulseinfotech.printphoto.exception.ProductIdException;
import in.pulseinfotech.printphoto.services.communication.MailService;
import in.pulseinfotech.printphoto.services.logging.PrintPhotoLogger;
import in.pulseinfotech.printphoto.services.logging.PrintPhotoLogger.LOG;

/**
 * This is a base class for every kind of product.
 * 
 * @author Rima Das
 * @version 1.0
 * @since 16 September 2014 <br>
 * <br>
 * <br>
 */
public class Product {
	private static String FQCN = Product.class.getName();
	/**
	 * This field holds the product id
	 */
	private long productId;

	/**
	 * This field holds the comment
	 */
	private String productComment;

	/**
	 * 
	 * @return product id
	 */
	public long getProductId() {
		return productId;
	}

	/**
	 * 
	 * @param productId
	 */
	public void setProductId(long productId) throws ProductIdException {
		if (productId >= 0) {
			this.productId = productId;
		} else {

			PrintPhotoLogger.log4j(FQCN, LOG.ERROR, "Negative Product ID",
					new ProductIdException(" Negative Product ID "));
			throw new ProductIdException(" Negative Product ID ");
		}
	}

	/**
	 * 
	 * @return productComment
	 */
	public String getProductComment() {
		return productComment;
	}

	/**
	 * 
	 * @param comment
	 */
	public void setProductComment(String productComment) {
		this.productComment = productComment;
	}

}
