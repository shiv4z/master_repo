package in.shiv.mapper;

import org.mapstruct.Mapper;

import in.shiv.entity.Product;
import in.shiv.model.ProductDto;

@Mapper
public interface MpapperStruct {
	
	ProductDto getDtoObject(Product product);

}
