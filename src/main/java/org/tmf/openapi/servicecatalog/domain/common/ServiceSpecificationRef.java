package org.tmf.openapi.servicecatalog.domain.common;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class ServiceSpecificationRef extends BaseRef {

	private String version;

}
