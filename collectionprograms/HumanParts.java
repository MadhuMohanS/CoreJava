package com.xworkz.collection.collectionprograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class HumanParts {
public static void main(String[] args) {
	String[] bodyParts = {
	                   "Head",
	                   "Neck",
	                   "Shoulder",
	                   "Arm",
	                   "Elbow",
	                   "Forearm",
	                   "Wrist",
	                   "Hand",
	                   "Fingers",
	                   "Thumb",
	                   "Chest",
	                   "Back",
	                   "Spine",
	                   "Abdomen",
	                   "Hip",
	                   "Buttocks",
	                   "Groin",
	                   "Thigh",
	                   "Knee",
	                   "Shin",
	                   "Calf",
	                   "Ankle",
	                   "Foot",
	                   "Toes",
	                   "Heel",
	                   "Sole",
	                   "Eye",
	                   "Eyebrow",
	                   "Eyelash",
	                   "Ear",
	                   "Nose",
	                   "Mouth",
	                   "Lips",
	                   "Tongue",
	                   "Teeth",
	                   "Jaw",
	                   "Chin",
	                   "Cheek",
	                   "Forehead",
	                   "Skull",
	                   "Brain",
	                   "Esophagus",
	                   "Trachea",
	                   "Lungs",
	                   "Heart",
	                   "Liver",
	                   "Stomach",
	                   "Intestines",
	                   "Kidneys",
	                   "Bladder",
	                   "Pancreas",
	                   "Spleen",
	                   "Gallbladder",
	                   "Blood vessels",
	                   "Muscles",
	                   "Bones",
	                   "Joints",
	                   "Skin",
	                   "Hair",
	                   "Nails",
	                   "Nerves",
	                   "Thyroid",
	                   "Adrenal glands",
	                   "Pituitary gland",
	                   "Reproductive organs",
	                   "Uterus",
	                   "Ovaries",
	                   "Testes",
	                   "Prostate",
	                   "Penis",
	                   "Vagina",
	                   "Breasts",
	                   "Lymph nodes",
	                   "Sweat glands",
	                   "Salivary glands",
	                   "Tonsils",
	                   "Appendix",
	                   "Uvula"
	};
	Collection<String> collection=new ArrayList<>();
	for(int i=0;i<bodyParts.length;i++) {
		collection.add(bodyParts[i]);
	}
	Iterator<String> ref=collection.iterator();
	while(ref.hasNext()) {
		String temp=ref.next();
		if(temp.length()<5) {
			System.out.println(temp);
		}
	}
	
}
}