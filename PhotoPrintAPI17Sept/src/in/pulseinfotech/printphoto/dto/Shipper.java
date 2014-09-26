package in.pulseinfotech.printphoto.dto;

import in.pulseinfotech.printphoto.exception.ProductIdException;
import in.pulseinfotech.printphoto.exception.ShipmentReceiptIDException;
import in.pulseinfotech.printphoto.exception.ShipperIdException;
import in.pulseinfotech.printphoto.services.communication.MailService;
import in.pulseinfotech.printphoto.services.logging.PrintPhotoLogger;
import in.pulseinfotech.printphoto.services.logging.PrintPhotoLogger.LOG;

/**
 * 
 * This class holds details about every Shipper who registers into the system.
 * It stores user's personal details like User name, company name, email id,
 * password, address.
 * 
 * @author Rima Das
 * @version 1.0
 * @since 16 September 2014 <br>
 * <br>
 * <br>
 * 
 */
public class Shipper {
	private static String FQCN = Shipper.class.getName();
	/**
	 * This field holds id to uniquely identify a shipper
	 */
	private long shipperId;

	/**
	 * This field holds shiper's name
	 */
	private String personName;

	/**
	 * This field holds the company's name
	 */
	private String companyName;

	/**
	 * This field holds shipment receipt id
	 */
	private String shipmentReceiptID;

	/**
	 * This field holds the date the shipment was handed over to the shipment
	 * company
	 */
	private String dateOfHandover;

	/**
	 * This field holds the date the shipment was delivered to the customer
	 */
	private String dateOfDelivery;

	/**
	 * 
	 * @return shipperid
	 */
	public long getShipperId() {
		return shipperId;
	}

	/**
	 * 
	 * @param shipperId
	 * @throws ShipperIdException
	 */
	public void setShipperId(long shipperId) throws ShipperIdException {
		if (shipperId >= 0) {
			this.shipperId = shipperId;
		} else {
			PrintPhotoLogger.log4j(FQCN, LOG.ERROR, "Negative Shipper ID",
					new ShipperIdException(" Negative Shipper ID "));
			throw new ShipperIdException(" Negative Shipper ID ");
		}
	}

	/**
	 * 
	 * @return shipper's name
	 */
	public String getPersonName() {
		return personName;
	}

	/**
	 * 
	 * @param personName
	 */
	public void setPersonName(String personName) {
		this.personName = personName;
	}

	/**
	 * 
	 * @return Shipping company's name
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * 
	 * @param companyName
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 * 
	 * @return ShipmentReceiptID
	 */
	public String getShipmentReceiptID() {
		return shipmentReceiptID;
	}

	/**
	 * 
	 * @param shipmentReceiptID
	 * @throws ShipmentReceiptIDException
	 */
	public void setShipmentReceiptID(String shipmentReceiptID)
			throws ShipmentReceiptIDException {
		if (shipmentReceiptID != "") {
			this.shipmentReceiptID = shipmentReceiptID;
		} else {
			PrintPhotoLogger.log4j(FQCN, LOG.ERROR,
					"Null shipment receipt ID received.",
					new ShipmentReceiptIDException(
							"Null shipment receipt ID received."));
			throw new ShipmentReceiptIDException(
					"Null shipment receipt ID received.");
		}
	}

	/**
	 * 
	 * @return Date Of Handover
	 */
	public String getDateOfHandover() {
		return dateOfHandover;
	}

	/**
	 * 
	 * @param dateOfHandover
	 */
	public void setDateOfHandover(String dateOfHandover) {
		this.dateOfHandover = dateOfHandover;
	}

	/**
	 * 
	 * @return DateOfDelivery
	 */
	public String getDateOfDelivery() {
		return dateOfDelivery;
	}

	/**
	 * 
	 * @param dateOfDelivery
	 */
	public void setDateOfDelivery(String dateOfDelivery) {
		this.dateOfDelivery = dateOfDelivery;
	}

}
