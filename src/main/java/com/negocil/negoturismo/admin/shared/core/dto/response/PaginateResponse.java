package com.negocil.negoturismo.admin.shared.core.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Generic paginated response wrapper")
public class PaginateResponse<T> implements Serializable {

    @Schema(description = "List of elements contained in the current page")
    private List<T> content;

    @Schema(description = "Indicates whether the current page has no elements", example = "false")
    private boolean empty = false;

    @Schema(description = "Indicates whether this is the first page", example = "true")
    private boolean first = false;

    @Schema(description = "Indicates whether this is the last page", example = "false")
    private boolean last = false;

    @Schema(description = "Current page number (zero-indexed)", example = "0")
    private int number = 0;

    @Schema(description = "Number of elements present in the current page", example = "10")
    private int numberOfElements = 0;

    @Schema(description = "Requested page size", example = "10")
    private int size = 0;

    @Schema(description = "Total number of elements across all pages", example = "42")
    private long totalElements = 0;

    @Schema(description = "Total number of pages available", example = "5")
    private int totalPages = 0;
}