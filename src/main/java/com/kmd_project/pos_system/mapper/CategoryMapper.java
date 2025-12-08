package comm.kmd_project.pos_system.mapper;

import com.kmd_project.pos_system.model.Category;
import com.kmd_project.pos_system.payload.dto.CategoryDTO;

public class CategoryMapper {


    public static CategoryDTO toDTO(Category category) {
        return CategoryDTO.builder()
                .id(category.getId())
                .name(category.getName())
                .storeId(category.getStore()!=null?category.getStore().getId():null)
                .build();
    }
}
