function isAnagram(s: string, t: string): boolean {
  if (s.length != t.length) return false;

  let sMap: Map<string, number> = new Map();
  let tMap: Map<string, number> = new Map();

  for (let i = 0; i < s.length; i++) {
    sMap.set(s[i], (sMap.get(s[i]) || 0) + 1);
    tMap.set(t[i], (tMap.get(t[i]) || 0) + 1);
  }

  for (let key of sMap.keys()) {
    if (sMap.get(key) != tMap.get(key)) return false;
  }

  return true;
}
