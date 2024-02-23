package com.xworkz.equalscontract.runner;

import java.util.HashMap;
import java.util.Map;

import com.xworkz.equalscontract.BrandDto;
import com.xworkz.equalscontract.TvDto;

public class TvBrandMap {
public static void main(String[] args) {
	BrandDto brandDto=new BrandDto("sony", "Kenichiro Yoshida", "banglore");
	TvDto tvDto=new TvDto("sonyXp", "49inches", "led");
	
	
	BrandDto brandDto1 = new BrandDto("Samsung", "Kim Hyun-suk", "Seoul");
	TvDto tvDto1 = new TvDto("Samsung SmartTV", "55 inches", "QLED");

	
	BrandDto brandDto2 = new BrandDto("LG", "Kwon Bong-seok", "Seoul");
	TvDto tvDto2 = new TvDto("LG OLED", "65 inches", "OLED");

	// Example 4
	BrandDto brandDto4 = new BrandDto("Panasonic", "Yuki Kusumi", "Osaka");
	TvDto tvDto4 = new TvDto("Panasonic Viera", "50 inches", "Plasma");

	
	BrandDto brandDto5 = new BrandDto("Toshiba", "Satoshi Tsunakawa", "Tokyo");
	TvDto tvDto5 = new TvDto("Toshiba Regza", "42 inches", "LCD");

	
	BrandDto brandDto6 = new BrandDto("Sharp", "Jiang Xiaobing", "Osaka");
	TvDto tvDto6 = new TvDto("Sharp Aquos", "70 inches", "LED");

	
	BrandDto brandDto7 = new BrandDto("Philips", "Frans van Houten", "Amsterdam");
	TvDto tvDto7 = new TvDto("Philips Ambilight", "55 inches", "LED");

	
	BrandDto brandDto8 = new BrandDto("Hisense", "Zhou Houjian", "Qingdao");
	TvDto tvDto8 = new TvDto("Hisense ULED", "65 inches", "ULED");


	BrandDto brandDto9 = new BrandDto("Vizio", "William Wang", "Irvine");
	TvDto tvDto9 = new TvDto("Vizio M-Series", "50 inches", "LED");

	
	
	
	Map<BrandDto, TvDto> brandTvMap=new HashMap<>();
	brandTvMap.put(brandDto, tvDto);
	brandTvMap.put(brandDto1, tvDto1);
	brandTvMap.put(brandDto2, tvDto2);
	
	brandTvMap.put(brandDto4, tvDto4);
	brandTvMap.put(brandDto5, tvDto5);
	brandTvMap.put(brandDto6, tvDto6);
	brandTvMap.put(brandDto7, tvDto7);
	brandTvMap.put(brandDto8, tvDto8);
	brandTvMap.put(brandDto9, tvDto9);
	
	BrandDto brandDto10 = new BrandDto("sony", "Chad Wang", "Guangzhou");
	TvDto tvDto10 = new TvDto("RCA Roku TV", "43 inches", "LED");
	
	brandTvMap.put(brandDto10, tvDto10);
	
	brandTvMap.forEach((k,v)->System.out.println(k+" "+v));
	

}
}
