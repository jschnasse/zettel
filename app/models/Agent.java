package models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;

import play.data.validation.ValidationError;
import services.ZettelHelper;
import services.ZettelModel;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Agent extends ZettelModel {

	@Override
	protected String getType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected List<ValidationError> validate() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @return json ld map for this model
	 */
	@Override
	public Map<String, Object> serializeToMap() {
		Map<String, Object> jsonMap =
				new ObjectMapper().convertValue(this, HashMap.class);
		jsonMap.put("@context", ZettelHelper.etikett.getContext().get("@context"));
		return jsonMap;
	}
}