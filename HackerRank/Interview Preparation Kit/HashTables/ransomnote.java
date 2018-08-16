Map<String, Integer> mapMag = new HashMap<>();
        Map<String, Integer> mapNote = new HashMap<>();
        
        for(int magazine_i=0; magazine_i < magazine.length; magazine_i++){
            
            
            if (mapMag.containsKey(magazine[magazine_i])) {
                mapMag.put(magazine[magazine_i], mapMag.get(magazine[magazine_i]) + 1);
            }
            else {
                mapMag.put(magazine[magazine_i], 1);
            }   
        }
        
        
        for(int ransom_i=0; ransom_i < note.length; ransom_i++){
            
            if (mapNote.containsKey(ransom[ransom_i])) {
                mapNote.put(ransom[ransom_i], mapNote.get(ransom[ransom_i]) + 1);
            }
            else {
                mapNote.put(ransom[ransom_i], 1);
            }   
        }
        
        String ans = "Yes";
        for (int i=0;i<n;i++) {
            if (mapMag.containsKey(ransom[i])) {
                if (mapNote.get(ransom[i]) > mapMag.get(ransom[i])) {
                    ans = "No";
                    break;
                }
            }
            else {
                ans = "No";
                break;
            }
        }
        
        System.out.println(ans);