package com.rest.api.restconsume;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompleteData {
    private String page;
    private String per_page;
    private String totalrecord;
    private String total_pages;
    private List<Tourist> data;
}
