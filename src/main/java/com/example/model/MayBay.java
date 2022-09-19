package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "maybay")
public class MayBay {
	  @Id
	  private int MaMB;
	  private String Loai;
	  private int TamBay;
	  
}
