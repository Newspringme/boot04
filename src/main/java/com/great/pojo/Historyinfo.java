package com.great.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author su
 * @date 2020/5/27-18:25
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Historyinfo
{
	private int historyId;
	private int docId;
	private String userName;
	private int doPoint;
	private String doTime;
}
