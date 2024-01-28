package in.shiv.mapper;

import in.shiv.entity.Product;
import in.shiv.model.ProductDto;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-28T15:33:38+0530",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.21.0.v20200304-1404, environment: Java 17.0.7 (Oracle Corporation)"
)
public class MpapperStructImpl implements MpapperStruct {

    @Override
    public ProductDto getDtoObject(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductDto productDto = new ProductDto();

        productDto.setDescription( product.getDescription() );
        productDto.setId( product.getId() );
        productDto.setName( product.getName() );

        return productDto;
    }
}
