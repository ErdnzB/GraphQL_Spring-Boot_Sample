package graphql.filter;

import graphql.filter.baseFilter.FilterField;
import lombok.Data;

@Data
public class EmployeeFilter {
    private FilterField salary;
    private FilterField age;
    private FilterField position;
}