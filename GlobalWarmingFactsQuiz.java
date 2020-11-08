package com.yoc;

import java.util.Scanner;

public class GlobalWarmingFactsQuiz {

	public void takeQuiz() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Will you like to the quiz? Enter 1 for Yes, 0 for No: ");
		int reply = scanner.nextInt();
		byte replyCount = 0;
		byte response;
		if (reply == 1) {
			System.out.println(
					"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("A) No Recent Warming. If global warming science is so \"settled\", "
					+ "\nwhy did global warming stop 15 years ago, contrary to all \"consensus\" predictions? \n"
					+ "\n 1) There is no contradiction here – a regional event can have global significance, for example via economic impacts. In any case, the Medieval Warm Period was a regional phenomenon and the planet as a whole was cooler than today."
					+ "\n 2) Quite simply, it hasn't. Even global surface temperatures (although they only account for about 2% of the Earth's warming), "
					+ "\n    have warmed about 0.2°C over the past 15 years. More importantly, the planet has continued to accumulate heat at a rate "
					+ "\n   equivalent to 4 Hiroshima atomic bomb detonations per second over the past 15 years."
					+ "\n 3) The IPCC stated with 95% confidence that most of the global warming since 1950 is human-caused, with a best estimate that 100% is due to humans over the past 60 years. The IPCC was able to draw this conclusion with such high confidence because that's what the scientific evidence and research clearly and consistently concludes."
					+ "\n 4) All of the above...");
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			response = scanner.nextByte();
			if (response == 2) {
				replyCount++;
				System.out.println();
			}
			System.out.println();
			System.out.println(
					"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("B) Natural or Manmade? If we don't know how much of recent warming is natural, "
					+ "then how can we know how much is manmade? "
					+ "\n 1) hfavhvdbhjcbjkbbylklkcak,hfcbhbn vhbkhvbjvfhvh bvbjk,nvhbjnvfjnb vcnldsfb j.bhfdmka."
					+ "\n 2) The IPCC stated with 95% confidence that most of the global warming since 1950 is human-caused, with a best estimate that 100% is due to humans over the past 60 years."
					+ "\n   The IPCC was able to draw this conclusion with such high confidence because that's what the scientific evidence and research clearly and consistently concludes."
					+ "\n 3) fujffklfvguhvioel;ilvhfcda;kiihvufvj;hjafjfk;l;jdkjfrgkfslfjhryifdaltq"
					+ "\n 4) None of the above...");
			System.out.println(
					"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			response = scanner.nextByte();
			if (response == 2) {
				replyCount++;
				System.out.println();
			}
			System.out.println();
			System.out.println(
					"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println(
					"C) IPCC Politics and Beliefs. Why does it take a political body (the IPCC) to tell us what scientists \"believe\"? And when did scientists' \"beliefs\" \ntranslate into proof?"
							+ "\nAnd when was scientific truth determined by a vote…especially when those allowed to vote are from the Global Warming Believers Party? "
							+ "\n 1) The IPCC merely organizes the world's top climate scientists every 5 to 7 years. It's those scientists who summarize the up-to-date status of the scientific research in their respective fields of expertise. "
							+ "\n   The IPCC report and the 97% expert consensus on human-caused global warming are themselves not proof of anything. They summarize and reflect the scientific evidence – that vast body of evidence is the reason the consensus exists."
							+ "\n 2) nfjfjbvf.fda.vefv.ajfdbfdlkvjjebdahbfflhrfbfhjafbfhb,ahrfnvbjalbjk"
							+ "\n 3) jlkfducv;f.vhvfhbvbhjvbhcbchv hj" + "4) bcscl.vfl.dcCIV;HLEFAF;FIBLVVFGAJ"
							+ "\n 4) sjlweyflifdhldfhiwsudghujslhscb");
			System.out.println(
					"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			response = scanner.nextByte();
			if (response == 1) {
				replyCount++;
			}

			System.out.println();
			System.out.println(
					"-----------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println(
					" D) Climate Models Can't Even Hindcast. How did climate modelers, who already knew the answer, "
							+ "still fail to explain the lack of a significant temperature rise over the last 30+ years? In other words, how to you botch a hindcast? "
							+ "\n1) tefdhjfguschhdhccklkcclcljabcxnsbxzjdly,alhvgdyfldyhgcla"
							+ "\n2) hdsldifchbchxnb;inyansernestjkd;uij;vefuijsbbds;dcvllo,vchbl"
							+ "\n3) hdsghvcyuclvidslYHLGHCBBHDCVB HDHC,DHCLIUJCHLVHSDJCLKJSDXGKHVCBHDJBCDHSKUyhjndlbhcbhlfyulLhJDLSHldculiunhgftyffyuguiytdiuifty"
							+ "\n4) Global surface temperatures have risen more than 0.5°C over the past 30 years. That rise is significant, "
							+ "both in the statistical and figurative sense. Climate models have accurately reproduced that rise.");
			System.out.println(
					"------------------------------------------------------------------------------------------------------------------------------------------------------");
			response = scanner.nextByte();
			if (response == 4) {
				replyCount++;
				System.out.println();
			}

			System.out.println();
			System.out.println(
					"-----------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println(
					"E) Is CO2 Bad? How did carbon dioxide, necessary for life on Earth and only 4 parts in 10,000 of our atmosphere, "
							+ "get rebranded as some sort of dangerous gas? "
							+ "\n 1) Carbon dioxide itself is not \"bad.\" Water is also necessary for life. Too much water will kill you. "
							+ "     \n Too much carbon dioxide causes dangerous climate change. Greenhouse gases were determined to be pollutants as defined in the US Clean Air Act ."
							+ "\n 2) llhsdlsdfoagxksolyuidewihdlhdubfoiajfdhdkdsjjjaslhfdolayhcogudlfhlufoyhfsgislhfoynclldhnslhdf"
							+ "\n 3) nllhsdlsdfoagxksolyuidewihdlhdubfoiajfdhdkdsjjjaslhfdolayhcogudlfhlufoyhfsgislhfoynclldhnslhdfcdkatagfkidyfgvgdidgilflaoyf"
							+ "\n 4) nllhsdlsdfoagxksolyuidewihdlhdubfoiajfdhdkdsjjjaslhfdolayhcogudlfhlufoyhfsgislhfoynclldhnslhdflfdglofylgfguoflcaplftugv");
			System.out.println(
					"------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			response = scanner.nextByte();
			if (response == 1) {
				replyCount++;
				System.out.println();
			}
			if (replyCount == 5) {
				System.out.println("EXCELLENT!!!");
			} else if (replyCount == 4) {
				System.out.println("VERY GOOD...");
			} else {
				System.out.println("TIME TO BRUSH UP ON YOUR KNOWLEDGE OF GLOBAL WARMING..."
						+ "\nhttps://www.theguardian.com/environment/climate-consensus-97-per-cent/2014/may/06/top-ten-global-warming-skeptic-arguments-debunked");
			}

		} else {
			System.out.println("Thanks...");
		}

	}

	public static void main(String[] args) {
		GlobalWarmingFactsQuiz obj = new GlobalWarmingFactsQuiz();
		obj.takeQuiz();

	}

}
