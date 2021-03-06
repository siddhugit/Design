package cscie97.asn4.ecommerce.product;

import java.util.List;


/**
 * This is a concrete and specialized class 
 * inherited from Content and represents Ringtone objects.
 * @author ssingh
 *
 */
class RingTone extends Content {

	public RingTone(String contentId,CONTENT_TYPE contentType,String contentName, String contentDescription,
			String contentAuthor, int contentRating,
			List<String> contentCategories, List<Country> contentCountries,
			List<Device> contentDevices, float contentPrice,
			List<String> contentLanguages, String contentImageURL) {
		super(contentId,contentType,contentName, contentDescription, contentAuthor, contentRating,
				contentCategories, contentCountries, contentDevices, contentPrice,
				contentLanguages, contentImageURL);
		// TODO Auto-generated constructor stub
	}
}
